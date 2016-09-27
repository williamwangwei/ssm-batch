package batch;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.william.batch.model.BatchExeDefine;
import com.william.batch.model.BatchJobDefine;
import com.william.batch.model.BatchJobDefineExample;
import com.william.batch.model.BatchJobDefineExample.Criteria;
import com.william.batch.service.BatchService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-trans.xml","classpath:spring/applicationContext-service.xml" })
public class TestSQL {
	private static final Logger logger = Logger.getLogger(TestSQL.class);
	@Autowired
	private BatchService batchService;
	@Test
	public void tt01(){
		 BatchExeDefine temp1 = batchService.selectBatchExeDefineByPrimaryKeyS("100000");
		 logger.info(temp1.getBatchName());
	}
	
	@Test
	public void tt02(){
		 BatchJobDefineExample example = new BatchJobDefineExample();
		Criteria criteria = example.createCriteria();
		//criteria.andJobIdEqualTo("000203");
		int count = batchService.countBatchJobDefineByExampleS(example);
		logger.info("count 总数"+count);
		List<BatchJobDefine> batchJobDefines = batchService.selectBatchJobDefineByExampleS(example );
		 for (BatchJobDefine batchJobDefine : batchJobDefines) {
			 logger.info(batchJobDefine);
		}
		 
	}
}
