class Node
  @value = nil
  @dotNode = nil
  @dashNode = nil

  def value=(character)
    @value = character
  end

  def value
    return @value
  end

  def pull(string)
    if string[0] == "."
      return @dotNode.pull(string[1..-1]) if string.length > 1
      return @dotNode.value
    elsif string[0] == "-"
      return @dashNode.pull(string[1..-1]) if string.length > 1
      return @dashNode.value
    end
  end

  def push(string, character)
    if string[0] == "."
      if @dotNode == nil
        @dotNode = Node.new()
        if(string.length > 1)
          @dotNode.push(string[1..-1], character)
        else
          @dotNode.value = character
          return @dotNode
        end
      else
        if(string.length > 1)
          @dotNode.push(string[1..-1], character)
        else
          @dotNode.value = character
          return @dotNode
        end
      end
    elsif string[0] == "-"
      if @dashNode == nil
        @dashNode = Node.new()
        if(string.length > 1)
          @dashNode.push(string[1..-1], character)
        else
          @dashNode.value = character
          return @dashNode
        end
      else
        if(string.length > 1)
          @dashNode.push(string[1..-1], character)
        else
          @dashNode.value = character
          return @dashNode
        end
      end
    end
  end
end

class MorseCode
  def self.convertString(string)
    rootNode = Node.new()

    rootNode.push(".-",    "A")
    rootNode.push("-...",  "B")
    rootNode.push("-.-.",  "C")
    rootNode.push("-..",   "D")
    rootNode.push(".",     "E")
    rootNode.push("..-.",  "F")
    rootNode.push("--.",   "G")
    rootNode.push("....",  "H")
    rootNode.push("..",    "I")
    rootNode.push(".---",  "J")
    rootNode.push("-.-",   "K")
    rootNode.push(".-..",  "L")
    rootNode.push("--",    "M")
    rootNode.push("-.",    "N")
    rootNode.push("---",   "O")
    rootNode.push(".--.",  "P")
    rootNode.push("--.-",  "Q")
    rootNode.push(".-.",   "R")
    rootNode.push("...",   "S")
    rootNode.push("-",     "T")
    rootNode.push("..-",   "U")
    rootNode.push("...-",  "V")
    rootNode.push(".--",   "W")
    rootNode.push("-..-",  "X")
    rootNode.push("-.--",  "Y")
    rootNode.push("--..",  "Z")

    rootNode.push(".-.-.-", ".")
    rootNode.push("--..--", ",")
    rootNode.push("..--..", "?")
    rootNode.push("-..-.", "/")
    rootNode.push(".--.-.", "@")

    rootNode.push(".----", "1")
    rootNode.push("..---", "2")
    rootNode.push("...--", "3")
    rootNode.push("....-", "4")
    rootNode.push(".....", "5")
    rootNode.push("-....", "6")
    rootNode.push("--...", "7")
    rootNode.push("---..", "8")
    rootNode.push("----.", "9")
    rootNode.push("-----", "0")

    # Support "/" as well as three spaces as seperator
    return string.gsub("/", "   ").split("   ").map{ |morseWord|
      morseWord.split(" ").map{ |morseCharacter|
        rootNode.pull(morseCharacter)
      }.join("")
    }.join(" ")
  end
end

puts "Morse Code"
puts "==================="
puts "a quick and (very) dirty, (very) not DRY, code challenge entry"
puts "by Matthew Seeley <matthew@threadlight.com>"
puts ""
file = File.open((ARGV[0] ? ARGV[0].to_s : "challenge3_sample.txt"), "rb")
puts MorseCode.convertString(file.read)
file.close
