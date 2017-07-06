package DAO;

import datomic.Connection;
import datomic.Database;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static DAO.Fns.scratchConnection;
import static DAO.IO.transactAllFromResource;
import static datomic.Util.list;

/**
 * Created by luizleite on 06/07/17.
 */
public class Move {

    public static void main(String[] args) throws IOException {
        Connection conn = scratchConnection();
        transactAllFromResource(conn, "datomic_bank/move-schema.edn");
        Database db = conn.db();

    }

    public void txMove(Connection connection, String userId, Long value, String transaction) {
        Object move = list("");
        try {
            Object txResul = connection.transact((List) move).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
