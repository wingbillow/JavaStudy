package com.njcb.oo4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(1, "李四"); // key重复
		map.put(2, "王五");
		map.put(3, null);
		map.put(null, "赵六");
		System.out.println(map);

		System.out.println(map.get(1));
		System.out.println(map.get(null));
		System.out.println(map.get(200)); // 没有则返回null

		Set<Integer> set = map.keySet(); // 取得全部的key
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}

		Set entrySet = map.entrySet();
		Iterator interator = entrySet.iterator();
		while (interator.hasNext()) {
			Map.Entry me = (Entry) interator.next();
			System.out.println(me.getKey() + " --> " + me.getValue());
		}
	}

}
