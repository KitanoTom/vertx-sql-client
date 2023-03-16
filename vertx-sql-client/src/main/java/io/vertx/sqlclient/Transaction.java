/*
 * Copyright (C) 2017 Julien Viet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.vertx.sqlclient;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Future;

/**
 * A transaction.
 */
@VertxGen
public interface Transaction {

  /**
   * Commit the current transaction.
   */
  Future<Void> commit();

  /**
   * Rollback the transaction and release the associated resources.
   */
  Future<Void> rollback();

  /**
   * Return the transaction completion {@code Future} that
   * succeeds when the transaction commits and
   * fails with {@link TransactionRollbackException} when the transaction rolls back.
   *
   * @return the transaction result
   */
  Future<Void> completion();

}
