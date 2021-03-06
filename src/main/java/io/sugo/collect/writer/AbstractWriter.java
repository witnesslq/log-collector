package io.sugo.collect.writer;

import io.sugo.collect.Configure;

import java.util.List;

/**
 * Created by fengxj on 4/8/17.
 */
public abstract class AbstractWriter {
  private Configure conf;

  public AbstractWriter() {
  }

  public AbstractWriter(Configure conf) {
    this.conf = conf;
  }

  public abstract boolean write(List<String> messages);
}
