package com.dmr;

import junit.framework.TestCase;

public class crcTest extends TestCase {
	
	// Test the CRC8 code
	public void testCRC8 ()	{
		int a,returnCRC;
		crc crctest=new crc();
		boolean testBinaryPass[]={true,true,true,true,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,true,false,false};
		boolean testBinaryFail[]={false,true,true,true,false,false,false,true,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,true,false,false};
		// Test for a pass
		crctest.setCrc8Value(0);
		for (a=0;a<testBinaryPass.length;a++)	{
			crctest.crc8(testBinaryPass[a]);
		}
		returnCRC=crctest.getCrc8Value();
		assertEquals(0,returnCRC);
		// Test for a failure
		crctest.setCrc8Value(0);
		for (a=0;a<testBinaryFail.length;a++)	{
			crctest.crc8(testBinaryFail[a]);
		}
		returnCRC=crctest.getCrc8Value();
		assertEquals(152,returnCRC);
	}

}