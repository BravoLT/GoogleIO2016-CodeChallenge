module T9
  def self.toCharacter(numString)
    lookupHash = {
      '2' => ['A','B','C'],
      '3' => ['D','E','F'],
      '4' => ['G','H','I'],
      '5' => ['J','K','L'],
      '6' => ['M','N','O'],
      '7' => ['P','Q','R','S'],
      '8' => ['T','U','V'],
      '9' => ['W','X','Y','Z']
    }
    key = numString[0]
    index = numString.strip.length - 1
    return lookupHash[key][index]
  end

  def self.convertString(string)
    words = string.split(" ")
    return words.map do |word|
      word.split(".").map{ |letter| T9.toCharacter(letter) }.join("")
    end.join(" ")
  end

end

puts "T9 Texting"
puts "==================="
puts "a quick and dirty code challenge entry"
puts "by Matthew Seeley <matthew@threadlight.com>"
puts ""
file = File.open((ARGV[0] ? ARGV[0].to_s : "challenge2_sample.txt"), "rb")
puts T9.convertString(file.read)
file.close
