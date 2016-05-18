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


rootNode = Node.new()

rootNode.push(".", "E")
rootNode.push("..", "I")
rootNode.push("...", "S")

puts rootNode.pull(".")
puts rootNode.pull("..")
puts rootNode.pull("...")
