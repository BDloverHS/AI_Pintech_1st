package org.koreait.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// 설정파일 통합을 위해 Import 어노테이션 사용
@Import(DbConfig.class)
public class AppCtx {

}
