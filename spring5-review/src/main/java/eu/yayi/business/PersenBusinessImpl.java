package eu.yayi.business;

import eu.yayi.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

public class PersenBusinessImpl implements IPersenBusiness {

    @Autowired
    @Qualifier("fakeData")
    private List<Person> data;

    public PersenBusinessImpl(List<Person> data) {
        this.data = data;
    }

    @Override
    public List<Person> getRondomPerson() {
        return data;
    }
}
