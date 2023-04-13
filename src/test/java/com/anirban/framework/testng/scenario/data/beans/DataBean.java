package com.anirban.framework.testng.scenario.data.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataBean {
	
	
	@Getter @Setter private String sName;
	@Getter @Setter private String sDept;
	@Getter @Setter private int id;
}
