package wedev.db.dao;

import javax.sql.DataSource;

/**
 * Created by hedingwei on 3/22/15.
 */

public abstract class AbstractDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public AbstractDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
