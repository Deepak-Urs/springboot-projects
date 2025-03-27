package com.example.service;

import jakarta.inject.Singleton;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.*;
import software.amazon.awssdk.services.s3.model.*;

@Singleton
public class AwsS3Service {

    private final S3Client s3Client;
    private final String bucketName = "your-s3-bucket-name"; // ← replace this

    public AwsS3Service() {
        this.s3Client = S3Client.builder()
                .region(Region.US_EAST_1) // ← update if needed
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();
    }

    public String upload(String key, String jsonContent) {
        PutObjectRequest putRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .contentType("application/json")
                .build();

        s3Client.putObject(putRequest, RequestBody.fromString(jsonContent));

        return "Uploaded to S3: s3://" + bucketName + "/" + key;
    }
}
