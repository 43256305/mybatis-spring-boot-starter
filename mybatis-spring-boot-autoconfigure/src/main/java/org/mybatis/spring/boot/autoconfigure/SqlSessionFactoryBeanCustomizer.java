/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.spring.boot.autoconfigure;

import org.mybatis.spring.SqlSessionFactoryBean;

/**
 * Callback interface that can be customized a {@link SqlSessionFactoryBean} object generated on auto-configuration.
 *
 * @author Kazuki Shimizu
 *
 * @since 2.2.2
 *
 * xjh-自定义SqlSessionFactoryBean接口，我们可以通过实现此接口来自定义SqlSessionFactoryBean中的一些属性，如插件、别名等
 */
@FunctionalInterface
public interface SqlSessionFactoryBeanCustomizer {

  /**
   * Customize the given a {@link SqlSessionFactoryBean} object.
   *
   * @param factoryBean
   *          the factory bean object to customize
   */
  void customize(SqlSessionFactoryBean factoryBean);

}
