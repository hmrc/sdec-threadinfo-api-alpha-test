/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.api.specs

import org.scalatest.GivenWhenThen
import uk.gov.hmrc.api.Specdef.ThreadRefSteps
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

class ThreadReferenceSpec extends AnyFeatureSpec with Matchers with GivenWhenThen with ThreadRefSteps {

  Feature("Thread Reference number Validation") {

    Scenario("Valid Thread Reference number returns 200 response") {

      Given("The user makes a GET api call to the correct endpoint ")

      When("The user queries a 12 digit Thread Reference number")

      Then("The user should be able to see the expected response")

    }

  }
}
