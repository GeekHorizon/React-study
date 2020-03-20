package com.khc.study.presentation.controller.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Input: [1,2,3] Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
 * ]
 */
@Controller
public class HelloWorldTest {

  @GetMapping("/test/{name}.html")
  @ResponseBody
  public List<List<Integer>> leetCode(@PathVariable String name, Model model) {
    int[] nums = IntStream.range(1, 4).toArray();
    
    System.out.println("a");
    System.out.println(Arrays.toString(nums));

    return null;
  }

  /**
   * 세마포어를 통해 임계구역 동기화 진행
   * 세마포어의 permits수를 통한 set의 개수 통제
   * 
   * @param <T>
   */
  public class BoundedHashSet<T> {

    private final Set<T> set;
    private final Semaphore semaphore;

    public BoundedHashSet(int permits) {
      semaphore = new Semaphore(permits);
      set = Collections.synchronizedSet(new HashSet<T>());
    }

    public boolean add(T o) throws InterruptedException {
      semaphore.acquire();
      boolean wasAdded = false;

      try {
        wasAdded = set.add(o);
        return wasAdded;
      } finally {
        if (!wasAdded) {
          semaphore.release();
        }
      }
    }

    public boolean remove(Object o) {
      boolean wasRemoved = set.remove(o);

      if (wasRemoved) {
        semaphore.release();
      }

      return wasRemoved;
    }
  }

}