package com.jeremy.service;

import com.jeremy.bean.Depart;

import java.util.List;

/**
 * company: www.kaikeba.com
 * Author: Rey
 */
public interface DepartService {
    boolean saveDepart(Depart depart);

    boolean removeDepartById(int id);

    boolean modifyDepart(Depart depart);

    Depart getDepartById(int id);

    List<Depart> listAllDeparts();
}
