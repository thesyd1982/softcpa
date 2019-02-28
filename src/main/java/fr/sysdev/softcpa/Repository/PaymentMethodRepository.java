package fr.sysdev.softcpa.Repository;

import fr.sysdev.softcpa.entity.PaymentMethodEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentMethodRepository {//extends JpaRepository<PaymentMethodEnum, Long> {

//    @Query(value = "SELECT pm.name AS name, COUNT(p.id) AS count FROM Payment p JOIN p.paymentMethodEnum pm GROUP BY pm.name")
//    Object[][] getPaymentMethodCount();

}