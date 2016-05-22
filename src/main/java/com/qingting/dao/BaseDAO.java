package com.qingting.dao;



import java.util.List;
import java.util.Map;

/**
 * Created by ZHANGBO583 on 2015-10-12.
 */
public interface BaseDAO<T> {
   public Integer add(T t);
   public Integer update(T t);
   public int delete(T t);

   /**
    *
    * @param <T> t
    * @param Page 分页page
    * @return
    */
   public List<T> getByPage(Map map);
   public T get(T t);
   public int getCount(T t);
   public Integer batchAdd(List<T> list);
   public List<T> getList(T t);

}
