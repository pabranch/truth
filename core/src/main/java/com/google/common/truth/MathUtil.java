/*
 * Copyright (c) 2014 Google, Inc.
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
 */
package com.google.common.truth;

/**
 * Math utilities to be shared by numeric subjects.
 */
public final class MathUtil {
  private MathUtil() {}

  public static boolean equals(double left, double right, double tolerance) {
    return Math.abs(left - right) <= Math.abs(tolerance);
  }

  public static boolean equals(float left, float right, float tolerance) {
    return equals((double) left, (double) right, (double) tolerance);
  }

  public static boolean notEquals(double left, double right, double tolerance) {
    return Math.abs(left - right) > Math.abs(tolerance);
  }

  public static boolean notEquals(float left, float right, float tolerance) {
    return equals((double) left, (double) right, (double) tolerance);
  }
}
