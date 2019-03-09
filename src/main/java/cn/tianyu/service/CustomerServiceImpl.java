package cn.tianyu.service;

import cn.tianyu.Dao.CustomerDaoImpl;
import cn.tianyu.Dao.ICustomerDao;
import cn.tianyu.entitys.Customer;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{
    private ICustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long custId) {
        customerDao.deleteCustomer(custId);
    }

    @Override
    public Customer findCustomerById(Long custId) {
        return customerDao.findCustomerById(custId);
    }
}
