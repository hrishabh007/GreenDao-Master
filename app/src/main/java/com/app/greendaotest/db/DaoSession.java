package com.app.greendaotest.db;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig groceryDaoConfig;

    private final GroceryDao groceryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        groceryDaoConfig = daoConfigMap.get(GroceryDao.class).clone();
        groceryDaoConfig.initIdentityScope(type);

        groceryDao = new GroceryDao(groceryDaoConfig, this);

        registerDao(Grocery.class, groceryDao);
    }
    
    public void clear() {
        groceryDaoConfig.clearIdentityScope();
    }

    public GroceryDao getGroceryDao() {
        return groceryDao;
    }

}
