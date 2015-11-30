package com.corryn.scb.data.dao.authentication;

import com.corryn.scb.data.dao.BaseDAOImpl;
import com.corryn.scb.data.persistence.model.AccountEntity;

public class AuthenticationDAOImpl
  extends BaseDAOImpl<AccountEntity>
  implements AuthenticationDAO
{
  public Class<AccountEntity> getEntityClass()
  {
    return AccountEntity.class;
  }
}
