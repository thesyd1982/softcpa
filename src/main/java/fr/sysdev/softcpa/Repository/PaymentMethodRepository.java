package fr.sysdev.softcpa.Repository;

import fr.sysdev.softcpa.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    @Query(value = "SELECT pm.name AS name, COUNT(p.id) AS count FROM Payment p JOIN p.paymentMethod pm GROUP BY pm.name")
    Object[][] getPaymentMethodCount();

}