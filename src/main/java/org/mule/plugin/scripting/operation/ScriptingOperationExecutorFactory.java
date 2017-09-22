/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.plugin.scripting.operation;

import org.mule.runtime.api.meta.model.operation.OperationModel;
import org.mule.runtime.extension.api.runtime.operation.ComponentExecutor;
import org.mule.runtime.extension.api.runtime.operation.ComponentExecutorFactory;

/**
 * Custom factory that creates our operation executor.
 *
 * @since 1.0
 */
public class ScriptingOperationExecutorFactory implements ComponentExecutorFactory<OperationModel> {

  @Override
  public ComponentExecutor createExecutor(OperationModel operationModel) {
    return new ScriptingOperationExecutor();
  }
}
