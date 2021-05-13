package org.example.neiro.model;

import com.example.model.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Inventario {

    private Map<Item, Integer> disponibilidad = new HashMap<>();

    public Inventario() {
        disponibilidad.put(new Item(1, "Shampoo", "A001", 10, 99, 20000), 4);
        disponibilidad.put(new Item(2, "Arroz", "A002", 0, 10, 6000), 5);
        disponibilidad.put(new Item(3, "Harina", "A003", 0, 11, 1500), 4);
        disponibilidad.put(new Item(4, "Leche", "A004", 0, 12, 18000), 4);
    }

    public boolean procesarItems(List<Item> items) {
        for (Item it : items) {
            Integer cantidad = disponibilidad.get(it);

            if (cantidad > 0) {
                disponibilidad.put(it, --cantidad);
                return true;
            }
        }
        return false;
    }

    public boolean procesarItem(Item item, int cantidad) {
        Integer disponible = disponibilidad.get(item);

        if (disponible <= 0 || disponible - cantidad < 0) {
            return false;
        }

        disponible -= cantidad;

        disponibilidad.put(item, disponible);
        return true;
    }

    public Item obtenerItemPorCodigo(String cod) {
        Set<Item> items = disponibilidad.keySet();
        for (Item it : items) {
            if (it.getCode().equalsIgnoreCase(cod)) {
                return it;
            }
        }
        return null;
    }

    public void ingresarItems(List<Item> items) {
        for (Item it : items) {
            Integer cantidad = disponibilidad.get(it);
            disponibilidad.put(it, ++cantidad);
        }
    }

    public void ingresarItem(Item item, int cantidad) {
        Integer disponible = disponibilidad.get(item);
        disponible += cantidad;
        disponibilidad.put(item, disponible);
    }

    public Set<Item> obtenerItems() {
        return disponibilidad.keySet();
    }
}
