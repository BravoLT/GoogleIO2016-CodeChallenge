
primes = []

(2..101).each do | n | 
  p = true
  (2..n).each do | d | 
    p = false if n % d == 0 && d != n
    break if !p
  end
  primes << n if p
end

puts "Primes: #{primes.join(',')}"
