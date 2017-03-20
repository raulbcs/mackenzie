/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.beans;

import javax.ejb.Remote;
import ejb.domain.Item;
import java.util.Collection;

/**
 *
 * @author rb
 */
@Remote

public interface MeuBeanRemote {
    void addItem(Item item);

    Collection<Item> getItems();
}
