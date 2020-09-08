////Least Recently Used (LRU) Cache – Using LinkedHashSet and Deque | Set 2
package com.problem.soving01;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class BLRU {
	LinkedHashSet<Integer> set;
	Deque<Integer> cache;
	int capacity;

	public BLRU(int capacity) {
		this.capacity = capacity;
		set = new LinkedHashSet<>(capacity);
		cache = new LinkedList<>();
	}

	public void look(int key) {
		// check if it is already present in cache (deque)
		if (set.contains(key)) {
			// remove it from cache so that it can be added at front of the cache
			cache.remove(key);
		} else {
			// not already in cache, adding it
			if (cache.size() == capacity) {
				// remove the last one from cache
				int last = cache.removeLast();
				set.remove(last);
			}
		}
		// add it to cache
		cache.push(key);
		set.add(key);
		System.out.println("Looking for key: " + key);
		printCache();
	}

	public void printCache() {
		System.out.print("Cache: ");
		Iterator<Integer> iterator = cache.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BLRU lru = new BLRU(4);
		lru.look(1);
		lru.look(2);
		lru.look(1);
		lru.look(3);
		lru.look(4);
		lru.look(3);
		lru.look(5);
		lru.look(4);
		lru.look(6);
	}
}
//https://algorithms.tutorialhorizon.com/least-recently-used-lru-cache-using-linkedhashset-and-deque-set-2/