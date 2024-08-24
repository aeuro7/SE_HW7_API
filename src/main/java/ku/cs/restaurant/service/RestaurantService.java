package ku.cs.restaurant.service;
// ทิเบต เจริญศรีไพบูลย์ 6510450399
// tibet charoensripaiboon 6510450399

import ku.cs.restaurant.entity.Restaurant;
import ku.cs.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


@Service
public class RestaurantService {


    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.findAll();
    }


    public Restaurant create(Restaurant restaurant) {
        Restaurant record = repository.save(restaurant);
        return record;
    }

    public Restaurant delete(UUID id) {
        Restaurant record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

    public Restaurant getRestaurantByName(String name) {
        return repository.findByName(name);
    }


    public List<Restaurant> getRestaurantByLocation(String location) {
        return repository.findByLocation(location);
    }


}
