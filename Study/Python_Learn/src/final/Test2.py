with open('latex.log', 'r', encoding='utf-8') as f:
    rows_set = set(f.readlines())
    print('��{}�ؼ���'.format(len(rows_set)))