package com.william.active.jms.service;

import org.junit.Test;

public class JMSTest {

	@Test
	public void tt01(){
		
		
		for(int i=700; i<800; i++){
			
			String sql = "Insert into SYMBOLS.CONSOLE_ACCT_TYPE (ACCT_TYPE, EFFIC_FLAG, CREATE_DATE, UPDATE_DATE) Values ('"+i+"', '1', TO_DATE('08/31/2016 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), TO_DATE('08/31/2016 00:00:00', 'MM/DD/YYYY HH24:MI:SS'));";
			System.out.println(sql);
		}
	}
}
