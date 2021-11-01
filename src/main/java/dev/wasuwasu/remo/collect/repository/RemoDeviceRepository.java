package dev.wasuwasu.remo.collect.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.wasuwasu.remo.collect.service.models.RemoDevice;

/**
 * @author wasuwasu
 */
public interface RemoDeviceRepository extends MongoRepository<RemoDevice, String> {}
