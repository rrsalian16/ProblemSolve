# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
print("Hello world")

class MaxStack:
  def __init__(self):
    self.arr=[]

  def push(self, val):
    self.arr.append(val)

  def pop(self):
    return self.arr.pop()

  def max(self):
    return max(self.arr)

s = MaxStack()
s.push(1)
s.push(2)
s.push(3)
s.push(2)
print(s.max())
# 3
s.pop()
s.pop()
print(s.max())