package cn.cjq.bomb.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by cjq on 2018/01/16.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
