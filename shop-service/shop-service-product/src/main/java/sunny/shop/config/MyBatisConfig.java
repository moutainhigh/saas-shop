package sunny.shop.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 扫描配置文件
 */
@Configuration
@MapperScan(basePackages = {"com.sunny.product.mapper","com.sunny.product.mapper.extend"})
public class MyBatisConfig {
}
