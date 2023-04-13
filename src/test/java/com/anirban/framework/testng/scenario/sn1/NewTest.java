package com.anirban.framework.testng.scenario.sn1;

import org.testng.annotations.Test;
import com.anirban.framework.testng.scenario.data.beans.DataBean;
import com.anirban.framework.testng.util.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends BaseTest{

  @Test(dataProvider = "dp",alwaysRun=true)
  public void f(DataBean bean) {
	  System.out.println("----- toString: ---- "+bean.toString());
  }
  
  @Test (alwaysRun=true)
  public void test2() {
	  Assert.equal(Assert.SOFT,true, false);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.assertAll();
  }
  
  @Test(alwaysRun=true)
  public void test3() {
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.assertAll();
  }
  @Test(alwaysRun=true)
  public void test4() {
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.equal(Assert.HARD,true, false);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.assertAll();
  }
  
  @Test(alwaysRun=true)
  public void test5() {
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.equal(Assert.SOFT,true, true);
	  Assert.assertAll();
  }
  
  @DataProvider
  public DataBean[] dp() {
	  DataBean oDataBean1=new DataBean();
	  DataBean oDataBean=new DataBean();
	  
	  oDataBean.setId(100);
	  oDataBean.setSDept("IT");
	  oDataBean.setSName("TOM");
	  
	  oDataBean1.setId(101);
	  oDataBean1.setSDept("HR");
	  oDataBean1.setSName("HARRY");
	  
	  ArrayList<DataBean> al=new ArrayList<DataBean>();
	  al.add(oDataBean);
	  al.add(oDataBean1);
	  //DataBean[] obj=new DataBean[]{oDataBean,oDataBean1};
	  DataBean[] obj=(DataBean[]) al.toArray(new DataBean[al.size()]);
	  return obj;
  }
  
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("---beforeClass--");  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("---afterClass--");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("---beforeTest--");
	 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("---afterTest--");
  }

}
