package DAO;

import datomic.Connection;
import java.io.IOException;

import static DAO.Fns.scratchConnection;

/**
 * Created by luizleite on 06/07/17.
 */
public class Move {

    public static void main(String[] args) throws IOException {
        Connection conn = scratchConnection();
    }
}
