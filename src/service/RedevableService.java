/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RedevableService {
    public Redevable findById(String id,ArrayList<Redevable> redevables){
	for (Redevable redevable : redevables) {
            if (redevable.getId().equals(id)) {
		return redevable;
    }
        }return null;
}

// public int save(Redevable redevable,ArrayList<Redevable> redevables){
//         Redevable loadedRedevable = findById(redevable.getId(),redevables);
//          if(loadedRedevable!=null){
//              return -1;
//          }else{
//          loadedRedevable.setId(redevable.getId());
//          redevables.add(loadedRedevable);
//          return 1;
//}
//          public int supprimer(Redevable redevable,ArrayList<Redevable> redevables){
//              Redevable supprRedevable = findById(redevable.getId(),redevables);
//              if(supprRedevable==null){
//              return -1;
//              }else{
//                  
//              }
//          }
              
}
