module Prime
  def self.isPrime?(number)
    # Prime Numbers are defined as "any integer greater than one,
    # if its only positive divisors are one and itself"
    # This means "1" can not be a prime number (by definition)
    results = []
    i = number
    while(i > 0) do
      results << i if (number % i == 0)
      i -= 1
    end
    return (results == [number, 1])
  end

  def self.allPrimeNumbers(maximum)
    return (0..maximum).to_a.select{ |number| isPrime?(number)}
  end
end

puts "Prime Numbers"
puts "==================="
puts "a quick and dirty code challenge entry"
puts "by Matthew Seeley <matthew@threadlight.com>"
puts ""
puts Prime.allPrimeNumbers((ARGV[0] ? ARGV[0].to_i : 101)).join(", ")
