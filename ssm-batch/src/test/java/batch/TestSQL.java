package batch;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.william.batch.model.BatchExeDefine;
import com.william.batch.service.BatchService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-trans.xml","classpath:spring/applicationContext-service.xml" })
public class TestSQL {
	private static final Logger logger = Logger.getLogger(TestSQL.class);
	@Autowired
	private BatchService batchService;
	@Test
	public void tt01(){
		 BatchExeDefine temp1 = batchService.selectByPrimaryKeyS("100000");
		 logger.info(temp1.getBatchName());
	}
}
