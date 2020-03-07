package dao;
/*
 * 操作数据库的工具类
 * 创建连接和释放资源
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataUtils {
	//定义操作数据库的驱动字符串
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//定义连接数据库的URL地址
	private static final String URL="jdbc:mysql://localhost:3306/recruitmanager"+"?useUnicode=True&characterEncoding=UTF-8";
	//定义数据库用户名
	private static final String USERNAME="root";
	//定义数据库的密码
	private static final String PASSWORD="1234";
	//定义一个获得连接的方法
	public static Connection createConnection() {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			} 
		return conn;
	}
	//释放资源的方法
	public static void closeAll(Connection conn,PreparedStatement pst,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(pst != null){
				pst.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//通用增删改方法
	public static int executeUpdate(String sql,Object...params) {
		Connection conn=createConnection();
		PreparedStatement pst=null;
		try {
			pst=conn.prepareStatement(sql);
			//如果参数数据不为空
			if(params!=null) {
				//为占位符赋值
				for (int i = 0; i < params.length; i++) {
					pst.setObject((i+1), params[i]);
				}
			}
			//调用方法并返回结果
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(conn,pst,null);
		}
		return 0;
	}
	//通用的查询方法
	public static ResultSet queryAll(String sql,Object...parms) {
		ResultSet rs=null;
		Connection conn=createConnection();
		PreparedStatement pst=null;
		try {
			pst=conn.prepareStatement(sql);
			//如果参数数据不为空
			if(parms!=null) {
				//为占位符赋值
				for (int i = 0; i < parms.length; i++) {
					pst.setObject((i+1), parms[i]);
				}
			}
			//调用方法并返回结果
			rs=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}