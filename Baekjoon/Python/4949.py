while True:
    a = input()
    a.replace(" ", "")
    arr = list(a)
    st = list()
    if len(arr) == 1:
        break
    small = 0
    mid = 0
    for i in a:
        if i == ".":
            break
        elif mid < 0 :
            break
        elif small < 0 :
            break
        elif i == "(":
            st.append("(")
            small += 1
        elif i == ")":
            if len(st) > 0 :
                if st[-1] == "(":
                    st.pop()
                    small -= 1
                else :
                    break
            else :
                small -= 1
                break
        elif i == "[":
            st.append("[")
            mid += 1
        elif i == "]" :
            if len(st) > 0 :
                if st[-1] == "[":
                    st.pop()
                    mid -= 1
                else :
                    break
            else :
                mid -= 1
                break

    if small == 0 and mid == 0:
        print("yes")
    else :
        print("no")