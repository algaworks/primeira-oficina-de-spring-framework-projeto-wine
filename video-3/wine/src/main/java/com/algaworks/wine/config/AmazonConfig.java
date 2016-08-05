package com.algaworks.wine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;

@Configuration
public class AmazonConfig {

	@Bean
	public AmazonS3 s3NinjaClient() {
		AWSCredentials credentials = new BasicAWSCredentials("AKIAIOSFODNN7EXAMPLE",
				"wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY");
		AmazonS3 s3Client = new AmazonS3Client(credentials, new ClientConfiguration());
		s3Client.setS3ClientOptions(S3ClientOptions.builder().setPathStyleAccess(true).build());
		s3Client.setEndpoint("http://localhost:9444/s3");
		return s3Client;
	}
	
}
