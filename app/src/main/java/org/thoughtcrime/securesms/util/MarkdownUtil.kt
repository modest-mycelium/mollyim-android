package org.thoughtcrime.securesms.util

import org.thoughtcrime.securesms.database.model.databaseprotos.BodyRangeList

fun process(body: String, bodyRanges: BodyRangeList?): Pair<String, BodyRangeList?> {
  return body to bodyRanges
}

