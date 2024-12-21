def myMethod(param) {
  if (param == null) {
    // Explicitly handle null parameter
    return 0 // Or throw an exception, or return a default value
  }
  // ... rest of the method
  return param * 2 // Example operation, replace with your logic
}

println myMethod(null) // Output: 0
println myMethod(5)    // Output: 10