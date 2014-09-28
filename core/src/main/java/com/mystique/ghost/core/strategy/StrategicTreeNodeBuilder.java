package com.mystique.ghost.core.strategy;

import java.util.Set;
import com.mystique.ghost.core.model.StrategicTreeNode;
import com.mystique.ghost.core.model.TreeNode;

/**
 * @author mystique
 */
public final class StrategicTreeNodeBuilder {
  private TreeNode node;
  private Set<StrategicTreeNode> children;
  private double winningProbability;

  public StrategicTreeNodeBuilder setTreeNode(TreeNode node) {
    this.node = node;
    return this;
  }

  public StrategicTreeNodeBuilder setChildren(Set<StrategicTreeNode> children) {
    this.children = children;
    return this;
  }

  public StrategicTreeNodeBuilder setWinningProbability(double winningProbability) {
    this.winningProbability = winningProbability;
    return this;
  }

  public StrategicTreeNode build() {
    return new StrategicTreeNode(node.getValue(), winningProbability, children);
  }
}
