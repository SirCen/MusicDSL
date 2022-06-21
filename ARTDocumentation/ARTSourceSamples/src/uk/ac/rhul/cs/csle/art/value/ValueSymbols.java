package uk.ac.rhul.cs.csle.art.value;

public enum ValueSymbols {
  __bottom, // failure

  __done, // terminal for program terms

  __empty, // uninitialised data

  __quote, // do-not-evaluate marker

  __binding, // a binding between terms for use in maps

  __boolean, // boolean type

  __char, // character type

  __intAP, __int32, // integer types

  __realAP, __real64, // real types

  __array, __list, __flexArray, __string, __set, __map, __mapChain, // collection types

  __eq, __ne, __gt, __lt, __ge, __le, // relations

  __not, __and, __or, __xor, __cnd, // logic and bitwise

  __lsh, __rsh, __ash, __rol, __ror, // shift and rotate

  __neg, __add, __sub, __mul, __div, __mod, __exp, // arithmetic

  __size, // size of collection - returns 1 for non-collection types

  __prepend, __append, // list specific manipulation

  __put, __get, __slice, __contains, __remove, __extract, __union, __intersection, __difference, // collection manipulation

  __cast, // convert values: shallow copy

  __user, // user backend hook
}
