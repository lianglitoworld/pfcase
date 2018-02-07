
/**  
 * Copyright by XXXX有限公司 (c) 2018 Apple Inc.  
 * Date:2018年2月6日下午1:17:57  
 */

package com.youzan.pfcase.mapper;

import java.util.List;

import com.youzan.pfcase.domain.Account;

/**
 * @author liliang
 *
 */

public interface AccountMapper {

Account getAccountByUsername(String username);

    
    List<Account> getAllKFAccount();

    Account getAccountByUsernameAndPassword(String username, String password);

    void insertAccount(Account account);

    void updateAccount(Account account);

    void insertSignon(Account account);

    void updateSignon(Account account);
}
