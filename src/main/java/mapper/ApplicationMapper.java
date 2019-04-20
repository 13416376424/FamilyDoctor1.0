package mapper;

import org.apache.ibatis.annotations.Insert;

import entity.Application;

public interface ApplicationMapper {

	//添加医生
		@Insert("INSERT INTO application(name,photo,credential,phone_num,id_number,hospital,position,introduce,is_handle)"
				+ " VALUES(#{name},#{photo},#{credential},#{phoneNum},#{idNumber},#{hospital},#{position},#{introduce},#{isHandle})")
		int addApplication(Application application);
}
