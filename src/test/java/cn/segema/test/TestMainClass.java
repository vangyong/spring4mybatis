package cn.segema.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.support.SimpleInstantiationStrategy;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestMainClass {

	public static void main(String[] args) {
		Pattern pattern = Pattern
				.compile(
						"[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",
						Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("正则表达式 Hello World,正则表达式 Hello World");
		// 替换第一个符合正则的数据
		System.out.println(matcher.replaceAll("Hello"));
		
		JdbcTemplate JdbcTemplate = new JdbcTemplate();
		
		SimpleInstantiationStrategy SimpleInstantiationStrategy = new SimpleInstantiationStrategy();
		
	}

}
