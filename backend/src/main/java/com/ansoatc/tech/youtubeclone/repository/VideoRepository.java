package com.ansoatc.tech.youtubeclone.repository;

import com.ansoatc.tech.youtubeclone.models.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
