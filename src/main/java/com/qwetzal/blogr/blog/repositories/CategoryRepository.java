package com.qwetzal.blogr.blog.repositories;

import com.qwetzal.blogr.blog.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByNameIn(List<String> categories);


//    @Query(value = "SELECT * FROM categories where name in (?1)", nativeQuery = true)

//
//    @Query(value = "select distinct(bank_message) from message where identifier = ?1", nativeQuery = true)
//    List<Object> findAllBankMessagesByIdentifier (String messageIdentifier);


//    @Query(nativeQuery = true, value = "select sum(total_limit), sum(limit_in_use) FROM lending_wallet WHERE fo_id = :fo_id and credit_type =:credit_type")
//    Tuple getLimitStatus (@Param("fo_id") int foId, @Param("credit_type") String creditType);


//
//    @Query(value = "select lw FROM LendingWallet lw WHERE lw.id = ?1")
//    LendingWallet getLendingWalletByIdForWrite (@Param("id") Integer id);

}
