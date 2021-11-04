package com.torryharris.train.newtrain.repository;

import com.torryharris.train.newtrain.model.TrainDetail;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<TrainDetail,Integer> {
}
