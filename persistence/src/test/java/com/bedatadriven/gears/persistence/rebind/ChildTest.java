/*
 * Copyright 2009-2010 BeDataDriven (alex@bedatadriven.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.

 */

package com.bedatadriven.gears.persistence.rebind;

import com.bedatadriven.gears.persistence.client.PersistenceUnit;
import com.bedatadriven.gears.persistence.client.domain.ChildUnit;
import com.bedatadriven.gears.persistence.client.domain.Parent;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.sql.SQLException;

/**
 * @author Alex Bertram
 */
public class ChildTest extends PersistenceUnitTestCase {

  @Override
  protected Class<? extends PersistenceUnit> getPersistenceUnit() {
    return ChildUnit.class;
  }
  
  @Test
  public void testAllReferencedEntitiesIncluded() throws SQLException {

    EntityManager em = emf.createEntityManager();
    Parent parent = new Parent(99, "Fred");
    em.persist(parent);
    em.close();

  }
}
